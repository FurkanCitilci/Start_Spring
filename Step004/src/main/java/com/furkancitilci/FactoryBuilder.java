package com.furkancitilci;

import java.io.FileInputStream;
import java.util.Properties;

public class FactoryBuilder implements IFactory{

    private IProvider provider;
    private IPrinter printer;

    private static FactoryBuilder instance;

    static {
        instance=new FactoryBuilder();
    }

    //new lemeyi önlemek için aşağıdaki metodu yazdık
    //sadece getInstance ile çalışır
    private FactoryBuilder(){

    }

    public static FactoryBuilder getInstance(){
        return instance;
    }


    private Properties properties;
    {
        properties = new Properties();
        try {

            /*
            properties dosyasını yükleyerek
            içindeki parametrekeri okumak gerek
             */
            properties.load(new FileInputStream("C:\\Users\\asus\\Desktop\\BilgeAdam\\Spring_DI\\SprinGiris\\Step004\\src\\main\\resources\\application.properties"));
           //String olarak printer ve provider değerlerini aldım
            String providerClass = properties.getProperty("provider");
            String printerClass = properties.getProperty("printer");
            //Class.forname ile okumak istediğn sınıfın const cağıraak instance oluşturdum
            //yani yeni nesne oluşturudum
            provider = (IProvider) Class.forName(providerClass).getDeclaredConstructor().newInstance();
            printer = (IPrinter) Class.forName(printerClass).getDeclaredConstructor().newInstance();

        }catch (Exception exception){
            System.err.println("Bir Hata oldu..."+ exception.toString());
        }
    }



    @Override
    public IPrinter getPrinter() {
        return this.printer;
    }

    @Override
    public IProvider getProvider() {
        return this.provider;
    }
}
