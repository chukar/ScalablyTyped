package typings.emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KindModule extends js.Object {
  var kind: String
  var module: String
  var name: String
}

object Anon_KindModule {
  @scala.inline
  def apply(kind: String, module: String, name: String): Anon_KindModule = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_KindModule]
  }
}

