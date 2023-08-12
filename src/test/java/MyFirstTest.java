import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

public class MyFirstTest {


    @Test
    public void test01(){
        RestAssured.baseURI = "https://serverest.dev";

        RestAssured.given().contentType(ContentType.JSON).log().all()
                .when().get("usuarios")
                .then().statusCode(HttpStatus.SC_OK).log().all();
    }

    @Test
    public void test02(){
        String id = "0uxuPY0cbmQhpEz1";
        RestAssured.baseURI = "https://serverest.dev";
        RestAssured.given().contentType(ContentType.JSON)
                .when().get("usuarios/{id}", id)
                .then().statusCode(HttpStatus.SC_OK).log().all();
    }

    @Test
    public void test03(){
        String id = "Diepqtemf0017EK8";
        RestAssured.baseURI = "https://serverest.dev";
        RestAssured.given().contentType(ContentType.JSON)
                .when().delete("usuarios/{id}", id)
                .then().statusCode(HttpStatus.SC_OK).log().all();
    }

    @Test
    public void test04(){
        RestAssured.baseURI = "https://serverest.dev";
        RestAssured.given().contentType(ContentType.JSON)
                .when().get("produtos")
                .then().statusCode(HttpStatus.SC_OK).log().all();
    }
}
