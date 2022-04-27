package com.company;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class DataStructuresAlgo {
    public static void main(String[] args) throws Exception {

        final Document document= Jsoup.connect("https://www.jlptmatome.com/jlpt-n5-vocabulary-list/2/").get();


        for(Element row:document.select("table.has-subtle-pale-blue-background-color.has-background tr")){

            final String title=row.select("td:nth-of-type(2)").text();
            final String Reading=row.select("td:nth-of-type(3)").text();
            final String Meaning=row.select("td:nth-of-type(4)").text();

            System.out.print('"'+Meaning+'"' + ",");

            //+"   "+ '"'+Reading+'"' +"          "+ '"'+Meaning+'"'

        }

    }
}
