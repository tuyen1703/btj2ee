package pxu.edu.vn.bt1;

public class ProductModel {
	private int idProduct;
	private String nameProduct;
	
	public ProductModel() {
		super();
	}

	public ProductModel(int idProduct, String nameProduct) {
		super();
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	@Override
	public String toString() {
		return "ProductModel [idProduct=" + idProduct + ", nameProduct=" + nameProduct + "]";
	}
}
