package krasnayaPahra.ui.pageObjects.enums;

public enum EnamsPahra {
    BASE_URL("https://krasnaya-pakhra-kurort.ru"),
    BUSINESS_URL("https://krasnaya-pakhra-kurort.ru/nomera/nomera-biznes/biznes");

    private String title;

    EnamsPahra(String title) {
        this.title = title;
    }
    @Override
    public String toString(){
        return this.title;
    }

}
