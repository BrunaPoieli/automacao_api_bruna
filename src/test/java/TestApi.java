import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.is;


public class TestApi {
    String enderecoAPI = "https://api.trello.com/1/actions/592f11060f95a3d3d46a987a/list/name";

    //Retorna o name da lista
    @Test
    public void getAPI(){
        String retorno = "{\"_value\":\"Professional\"}";
        given()
                .contentType(JSON)
        .when()
                .get(enderecoAPI)
        .then()
                .statusCode(200).assertThat().body(is(retorno));
    }
}
