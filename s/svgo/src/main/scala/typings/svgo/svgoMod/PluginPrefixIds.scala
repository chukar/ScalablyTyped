package typings.svgo.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginPrefixIds extends PluginConfig {
  var removeUnusedNS: Boolean | js.Object
}

object PluginPrefixIds {
  @scala.inline
  def apply(removeUnusedNS: Boolean | js.Object): PluginPrefixIds = {
    val __obj = js.Dynamic.literal(removeUnusedNS = removeUnusedNS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginPrefixIds]
  }
}

