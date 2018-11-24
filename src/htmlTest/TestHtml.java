package htmlTest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by lt on 2018/11/21.
 */
public class TestHtml {
    public static void main(String[] args) throws IOException {
        // getHtml();
        getHtmlByurl();
    }

    public static void getHtml() throws IOException {
        String html = "<table><tr><td>名称</td><td>价格（元/本）</td><td>描述</td></tr><tr><td>《雾都的孤儿》</td><td>33.4</td><td>叙述雾都的孤儿</td></tr></table>";
        Document doc = Jsoup.parse(html);
        Elements tables = doc.getElementsByTag("table");
        Elements tdlist = tables.get(0).getElementsByTag("td");
        for (Element str : tdlist) {
            System.out.println(str.text());
        }
    }

    private static void getHtmlByurl() throws IOException {
        String url = " <div class=\"list-linkclear\"><ul><li><a data-param=\"?_f=index_video_1_0\" href=\"https://tv.sohu.com/v/dXMvMjc0MzgzNjczLzExMDE3OTMzMy5zaHRtbA==.html\" target=\"_blank\">聚　焦</a><em class=\"line\">|</em><a data-param=\"?_f=index_video__1_1\" href=\"https://tv.sohu.com/v/dXMvMjc0MzgzNjczLzExMDE3OTMzMy5zaHRtbA==.html\" target=\"_blank\">雌雄大盗专偷双11快递 得手后嗨到“蹦迪”</a> </li><li><a data-param=\"?_f=index_video_2_0\" href=\"https://tv.sohu.com/v/dXMvMzA3NDE3MTE5LzExMDIwOTA3OS5zaHRtbA==.html\" target=\"_blank\">关　注</a><em class=\"line\">|</em><a data-param=\"?_f=index_video__2_1\" href=\"https://tv.sohu.com/v/dXMvMzA3NDE3MTE5LzExMDIwOTA3OS5zaHRtbA==.html\" target=\"_blank\">男歌手被指穿DG 怒剪上衣赤身离开舞台</a> </li><li><a data-param=\"?_f=index_video_3_0\" href=\"https://tv.sohu.com/v/dXMvMzMxMTkwODA1LzExMDIwODMzMS5zaHRtbA==.html\" target=\"_blank\">热　点</a><em class=\"line\">|</em><a data-param=\"?_f=index_video__3_1\" href=\"https://tv.sohu.com/v/dXMvMzMxMTkwODA1LzExMDIwODMzMS5zaHRtbA==.html\" target=\"_blank\">铸剑大师还原春秋铁艺 半年卖剑1200万</a> </li></ul></div>";
        Document doc = Jsoup.parse(url);
        // 获取网站标题
        String title = doc.title();
        System.out.println("标题是：" + title);
        // 获取
        Elements table = doc.getElementsByClass("list-linkclear");
        Elements ulList = table.get(0).getElementsByTag("ul");
        for (int i = 0; i < ulList.size(); i++) {
            Elements liList = table.get(0).getElementsByTag("li");
            for (Element str : liList) {
                System.out.println(str.text());
            }
        }
    }
}
