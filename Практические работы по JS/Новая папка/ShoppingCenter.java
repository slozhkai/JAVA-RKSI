class ShoppingCenter extends Building{
    private boolean gucci;
    private int shop;
    private String address_center;

    public ShoppingCenter(String title, String address, int year, String name, boolean culture){
        super(title, address, year, name, culture);
        this.gucci = gucci;
        this.shop = shop;
        this.address_center = address_center;
    }

    public boolean getgucci(){
        return  gucci;
    }
    public void setGucci(boolean gucci){
        this.gucci = gucci;
    }

    public int getShop(){
        return  shop;
    }
    public void setShop(int shop){
        this.shop = shop;
    }

    public String getAddress_center(){
        return  address_center;
    }
    public void setAddress_center(String address_center){
        this.address_center = address_center;
    }

    @Override
    public void display(){
        System.out.println("Это Торговый центр");
    }

    @Override
    public String toString(){
        return super.toString() + "\nЕсть магазин Гучи: " + gucci + "\nКоличество магазинов: " + shop + "\nАдресс: " + address_center;
    }
}
