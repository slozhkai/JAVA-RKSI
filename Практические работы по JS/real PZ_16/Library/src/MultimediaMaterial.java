class MultimediaMaterial extends Library{
    private String format;
    private double duration; //длительность
    private String type;

    public MultimediaMaterial(String title, String address, int year, String name, boolean online, String format, double duration, String type){
    super(title, address, year, name, online);
    this.format = format;
    this.duration = duration;
    this.type = type;
    }
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public void display() {

    }
    
    @Override
    public String toString() {
        return super.toString() + "\nformat: " + format + "\nduration: " + duration +  "\ntype: " + type ;
    }
}
