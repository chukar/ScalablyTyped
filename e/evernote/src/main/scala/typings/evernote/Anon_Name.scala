package typings.evernote

import typings.evernote.evernoteMod.Evernote.BootstrapSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String
  var settings: BootstrapSettings
}

object Anon_Name {
  @scala.inline
  def apply(name: String, settings: BootstrapSettings): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Name]
  }
}

