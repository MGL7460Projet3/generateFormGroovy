package generateFormGroovy.src.dsl;

import generateFormGroovy.src.model.Form;

public class MyForm extends FormBuilder {

    void configureForm() { 
        form {
            label { e ->
                e.text = "label1"
            }
            input { e ->
                e.name = "input1"
            }
            input { e ->
                e.text = "label2"
            }
            input { e ->
                e.name = "input2"
            }
            checkbox { e ->
                e.name = "checkbox1"
                e.value = "checkbox1"
                e.checked = "checked"
                e.text = "checkbox1"
            }
            checkbox { e ->
                e.name = "checkbox1"
                e.value = "checkbox1"
                e.checked = ""
                e.text = "checkbox1"
            }
            button { e ->
                e.value = "submit"
            }		
        }
    }

}