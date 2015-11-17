package br.com.fiap.mobintroducaoandroid_aula4_app3;

/**
 * Created by michel on 16/11/15.
 */
public class MyItem {

    private String value; // representa o texto a ser exibido
    private int status; // representa o id da imagem

    public MyItem(int status, String value) {
        this.status = status;
        this.value = value;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {

        this.status = status;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {

        this.value = value;
    }


}
