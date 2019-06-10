package guru.springframework.commands;

import guru.springframework.domain.Product;
import java.math.BigDecimal;

/**
 * Created by jt on 1/10/17.
 */
public class CustomersForm {

    private Long id;
    private String firstName;
    private Product product;
    private String secondName;
    private String thirdName;
    private String imageUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the secondName
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * @param secondName the secondName to set
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * @return the thirdName
     */
    public String getThirdName() {
        return thirdName;
    }

    /**
     * @param thirdName the thirdName to set
     */
    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    /**
     * @return the imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * @param imageUrl the imageUrl to set
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }
}
