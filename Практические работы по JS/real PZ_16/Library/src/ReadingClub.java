class ReadingClub extends Library{
    private String peoplelist;
    private String rules;
    private String resourses;

    public ReadingClub(String title, String address, int year, String name, boolean online, String peoplelist, String rules, String resourses){
        super(title, address, year, name, online);
        this.peoplelist = peoplelist;
        this.rules = rules;
        this.resourses = resourses;
    }

    public String getPeoplelist() {
        return peoplelist;
    }

    public void setPeoplelist(String peoplelist) {
        this.peoplelist = peoplelist;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getResourses() {
        return resourses;
    }

    public void setResourses(String resourses) {
        this.resourses = resourses;
    }

    @Override
    public void display() {

    }

    @Override
    public String toString() {
        return super.toString() + "\nPeople list: " + peoplelist + "\nRules: " + rules + "\nResourses: " + resourses;
    }
}
