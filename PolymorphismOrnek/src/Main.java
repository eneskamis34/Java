public class Main {
    public static void main(String[] args) {
        //MailLoger mailLoger = new MailLoger();
        //mailLoger.log("Mesaj");

        //Hepsini görmek istiyorsam:
        BaseLogger[] loggers = new BaseLogger[]{new MailLoger(),new FileLogger(),new DatabaseLogger(), new ConsoleLogger()};
        for(BaseLogger logger: loggers)
        {
            logger.log("Log Mesajı");
        }

        CustomManager customManager = new CustomManager(new FileLogger());
        customManager.add();
    }
}
