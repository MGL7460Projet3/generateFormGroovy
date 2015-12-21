package generateFormGroovy.src.dsl;

import groovy.lang.Closure;
import generateFormGroovy.src.model.Form;
import generateFormGroovy.src.model.Input;

public abstract class FormBuilder {

    Form form

    void configure(Form form) {
        this.form = form
        configureForm()
    }

    abstract void configureForm()

    void form(Closure configureForm) {
        configureForm.call()
    }

    void input(Closure configureInput) {
        Input input = new Input()
        configureForm.call(input)
        form.inputs.add(input)
    }  
}