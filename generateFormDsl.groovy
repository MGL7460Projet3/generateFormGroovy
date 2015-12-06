def writer = new FileWriter('./generateFormGroovy/form.html')
//def writer = new StringWriter()

def html = new groovy.xml.MarkupBuilder(writer)
  html.html {
    head { title 'Generate Form' }
    body {
      h1 'Form'
      form (action:'whatever') {
        label(for:'first-name', 'first-name')
        input(type:'text',name:'first-name', id:'first-name', '')
        br('')
        label(for:'last-name', 'last-name')
        input(type:'text',name:'last-name', id:'last-name', '')
        br('')
        for (line in ['checkbox1','checkbox2','checkbox3'])
        {
          input(type:'checkbox',checked:'checked', id:line, '')
          label(for:line, line)
          br('')
        }
        input(type:'submit', value:'Envoyer')
        br('')
      }
    }
  }

// In case you would like to print it
print writer.toString()