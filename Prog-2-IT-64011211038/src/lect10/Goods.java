package lect10;

public class Goods {

    private int goodsId;
    private String goodsName;
    private String goodsDetails;
    private int goodsPrice;
    private int goodsStock;

    public Goods() {

    }

    public int getInt() {
        return this.goodsId;
        
    }
    
    public void setId(int goodsId) {
        this.goodsId=goodsId;
    } 
    
    public String getName() {
        return this.goodsName;
    }
    
    public void setName(String goodsName) {
        this.goodsName=goodsName;
    } 
    
    public String getDetail() {
        return this.goodsDetails;
    }
    
    public void setDetail(String goodsDetails) {
        this.goodsDetails=goodsDetails;
    } 
    
    public int getPrice() {
        return this.goodsPrice;
    }
    
    public void setPrice(int goodsPrice) {
        this.goodsPrice=goodsPrice;
    } 
    
    public int getStock() {
        return this.goodsStock;
    }
    
    public void setStock(int goodsStock) {
        this.goodsStock=goodsStock;
    } 
    
    public String toString() {
        return goodsId+","+goodsName+","+goodsDetails+","+goodsPrice+","+goodsStock;
    }
    


}

