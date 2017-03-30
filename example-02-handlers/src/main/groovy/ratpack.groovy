@Grab('io.ratpack:ratpack-groovy:1.4.5')

import static ratpack.groovy.Groovy.ratpack
import ratpack.http.MutableHeaders

ratpack {
  handlers {
    get {
      MutableHeaders headers = response.headers // <1>
      headers.set('Access-Control-Allow-Origin', '*') // <2>
      headers.set('Access-Control-Allow-Headers', 'x-requested-with, origin, content-type, accept') // <2>
      render 'Hola Greach 2017!'
    }
  }
}
