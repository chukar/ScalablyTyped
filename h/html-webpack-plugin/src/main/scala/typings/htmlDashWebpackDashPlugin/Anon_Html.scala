package typings.htmlDashWebpackDashPlugin

import typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginMod.HtmlWebpackPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Html extends js.Object {
  var html: String
  var outputName: String
  var plugin: HtmlWebpackPlugin
}

object Anon_Html {
  @scala.inline
  def apply(html: String, outputName: String, plugin: HtmlWebpackPlugin): Anon_Html = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Html]
  }
}

