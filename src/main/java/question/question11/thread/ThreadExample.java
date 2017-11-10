package question.question11.thread;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class ThreadExample {

    private static void download(String loadFrom, String saveTo) {
        new Thread(buildTask(loadFrom, saveTo)).start();
    }

    private static Runnable buildTask(String loadFrom, String saveTo) {
        return () -> {
            try {
                System.out.println("Загрузка началась в файл " + saveTo);
                URL website = new URL(loadFrom);
                ReadableByteChannel rbc = Channels.newChannel(website.openStream());
                FileOutputStream fos = new FileOutputStream(saveTo);
                fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
                System.out.println("Загрузка завершилась успешно " + saveTo);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Загрузка завершилась с ошибкой " + saveTo);
            }
        };
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Программа запустилась");

        download("https://r7---sn-5hne6n7d.googlevideo.com/videoplayback?ei=CO0FWs7FBczJ1gLrz4yoAg&requiressl=yes&ratebypass=yes&ipbits=0&expire=1510359400&mime=video%2Fmp4&mm=31&source=youtube&key=yt6&itag=22&ms=au&mt=1510337118&ip=37.58.82.169&mv=u&id=o-AAq7r-UozoJ3w3oBvC5nv2t3v855IkVHmeuBahyAaBbP&dur=204.567&mn=sn-5hne6n7d&lmt=1507611309522027&sparams=dur%2Cei%2Cid%2Cip%2Cipbits%2Citag%2Clmt%2Cmime%2Cmm%2Cmn%2Cms%2Cmv%2Cpl%2Cratebypass%2Crequiressl%2Csource%2Cexpire&pl=22&signature=1C5D4F227D3B52497EB0461BF040BFF21E5CA43B.B83033B534E0739773C09131FB05DE7BD26942E9&title=%D0%9F%D0%BE%D1%87%D0%B5%D0%BC%D1%83+%D0%BC%D1%8B+%D1%80%D0%B0%D1%81%D1%81%D1%82%D0%B0%D0%B5%D0%BC%D1%81%D1%8F+%D1%81+%D0%BB%D1%8E%D0%B4%D1%8C%D0%BC%D0%B8%2C+%D0%BA%D0%BE%D1%82%D0%BE%D1%80%D1%8B%D0%B5+%D0%BD%D0%B0%D0%BC+%D0%BD%D1%80%D0%B0%D0%B2%D1%8F%D1%82%D1%81%D1%8F%3F+%5BThe+School+of+Life%5D",
                "files/question11/video1.mp4");
        download("https://r1---sn-5hne6nsd.googlevideo.com/videoplayback?requiressl=yes&signature=DDB25D9CEBA657FC464ABE617321AE36DFAECE76.C98834F09E7EFEDDCBADAE6EB22E42AF0526DF19&itag=22&lmt=1508526337916085&id=o-AHeWu1sraHSdwUfW24wspNzPKWV6xTC5zQvmOCrb6kBV&ei=pe0FWqPuHZHN1wKlhafYAg&key=yt6&ms=au&sparams=dur%2Cei%2Cid%2Cip%2Cipbits%2Citag%2Clmt%2Cmime%2Cmm%2Cmn%2Cms%2Cmv%2Cpl%2Cratebypass%2Crequiressl%2Csource%2Cexpire&expire=1510359557&mv=u&pl=22&dur=250.845&source=youtube&mm=31&mn=sn-5hne6nsd&ipbits=0&ratebypass=yes&mt=1510337882&ip=37.58.82.170&mime=video%2Fmp4&title=%D0%A7%D1%82%D0%BE+%D0%B1%D1%83%D0%B4%D0%B5%D1%82+%D0%B5%D1%81%D0%BB%D0%B8+%D0%BD%D0%B8%D1%87%D0%B5%D0%B3%D0%BE+%D0%BD%D0%B5+%D1%83%D1%87%D0%B8%D1%82%D1%8C%3F+%5BLife+Noggin%5D",
                "files/question11/video2.mp4");
        download("https://r8---sn-5hne6nse.googlevideo.com/videoplayback?ms=au&id=o-AAvy-Qgs8PaIo7am0wYEe1Mue-8jx3obe3gk31BXUgxt&pl=22&mv=u&mt=1510337882&expire=1510359579&ei=uu0FWtf1Ndub1gKzmbVA&signature=239F90120329FDDA196BA99EA14172B5EC467B2B.E394B4ABA64B5DED96A3354A4E19CBBF2F59A7A4&ipbits=0&mime=video%2Fmp4&ip=37.58.82.168&mn=sn-5hne6nse&nh=IgpwcjA0LmFtczE1KgkxMjcuMC4wLjE&itag=22&ratebypass=yes&dur=352.246&source=youtube&mm=31&sparams=dur%2Cei%2Cid%2Cip%2Cipbits%2Citag%2Clmt%2Cmime%2Cmm%2Cmn%2Cms%2Cmv%2Cnh%2Cpl%2Cratebypass%2Crequiressl%2Csource%2Cexpire&requiressl=yes&key=yt6&lmt=1508719879024295&title=%D0%9F%D0%BE%D0%BB%D1%8C%D0%B7%D0%B0+%D0%B7%D0%BD%D0%B0%D0%BD%D0%B8%D1%8F+%D0%B2%D1%82%D0%BE%D1%80%D0%BE%D0%B3%D0%BE+%D1%8F%D0%B7%D1%8B%D0%BA%D0%B0+%D0%B4%D0%BB%D1%8F+%D0%92%D0%B0%D1%88%D0%B5%D0%B3%D0%BE+%D0%BC%D0%BE%D0%B7%D0%B3%D0%B0+%5BTED+ED%5D",
                "files/question11/video3.mp4");

//        buildTask("https://r8---sn-5hne6nse.googlevideo.com/videoplayback?ms=au&id=o-AAvy-Qgs8PaIo7am0wYEe1Mue-8jx3obe3gk31BXUgxt&pl=22&mv=u&mt=1510337882&expire=1510359579&ei=uu0FWtf1Ndub1gKzmbVA&signature=239F90120329FDDA196BA99EA14172B5EC467B2B.E394B4ABA64B5DED96A3354A4E19CBBF2F59A7A4&ipbits=0&mime=video%2Fmp4&ip=37.58.82.168&mn=sn-5hne6nse&nh=IgpwcjA0LmFtczE1KgkxMjcuMC4wLjE&itag=22&ratebypass=yes&dur=352.246&source=youtube&mm=31&sparams=dur%2Cei%2Cid%2Cip%2Cipbits%2Citag%2Clmt%2Cmime%2Cmm%2Cmn%2Cms%2Cmv%2Cnh%2Cpl%2Cratebypass%2Crequiressl%2Csource%2Cexpire&requiressl=yes&key=yt6&lmt=1508719879024295&title=%D0%9F%D0%BE%D0%BB%D1%8C%D0%B7%D0%B0+%D0%B7%D0%BD%D0%B0%D0%BD%D0%B8%D1%8F+%D0%B2%D1%82%D0%BE%D1%80%D0%BE%D0%B3%D0%BE+%D1%8F%D0%B7%D1%8B%D0%BA%D0%B0+%D0%B4%D0%BB%D1%8F+%D0%92%D0%B0%D1%88%D0%B5%D0%B3%D0%BE+%D0%BC%D0%BE%D0%B7%D0%B3%D0%B0+%5BTED+ED%5D",
//                "files/question11/video10.mp4").run();

        Calendar calendar = new GregorianCalendar();

        while(true) {
            Thread.sleep(1000);
            calendar = new GregorianCalendar();
            System.out.println("" + calendar.get(Calendar.MINUTE) + "\t:\t" + calendar.get(Calendar.SECOND));
        }
    }
}
