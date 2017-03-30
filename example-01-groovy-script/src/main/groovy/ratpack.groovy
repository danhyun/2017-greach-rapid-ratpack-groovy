@Grab('io.ratpack:ratpack-groovy:1.4.5') // <1>

import static ratpack.groovy.Groovy.ratpack

ratpack { // <2>
  handlers { // <3>
    get { // <4>
      render 'Hola mundo' // <5>
    }
  }
}
