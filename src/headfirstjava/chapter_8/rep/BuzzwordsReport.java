package headfirstjava.chapter_8.rep;

public class BuzzwordsReport extends Report {

    void runReport(){
        super.runReport(); //запустится внутри родительского класса
        buzzwordCompliance();
        printReport();
    }

    void buzzwordCompliance(){

    }
}
