package generateFormGroovy.src.dsl;

import generateFormGroovy.src.model.Form;

public class MyForm extends FormBuilder {

    void configureForm() { 
        form {
            input { e ->
                e.type = "text"
                e.value = "input1"
            }
            input { e ->
                e.type = "text"
                e.value = "input2"
            }
        }
    }

}