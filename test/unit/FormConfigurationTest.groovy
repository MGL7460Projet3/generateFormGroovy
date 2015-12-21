package generateFormGroovy.test.unit;

import static org.junit.Assert.*;
import generateFormGroovy.src.dsl.MyForm;
import generateFormGroovy.src.model.Form;
import generateFormGroovy.src.model.Input;
import org.junit.Test;

public class FormConfigurationTest {

    /*  */


    @Test
    public void testInput() throws Exception {

        // setup
        Input input = new Input(type:"text", value:"text1")
        Form form = new Form(inputs:[input])

        // verify
        assertEquals "text", form.inputs[0].type
        assertEquals "text1", form.inputs[0].value
    }

    /*  */

    @Test
    public void shouldConfigureForm() throws Exception {

        // setup
        Form form = new Form()
        new MyForm().configure form

        // verify elements
        assertEquals "text", form.inputs[0].type
        assertEquals "input1", form.inputs[0].value
        assertEquals "text", form.inputs[1].type
        assertEquals "input2", form.inputs[1].value
        
    }

}