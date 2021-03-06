package typings.emojiDashJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emoji-js", JSImport.Namespace)
@js.native
object emojiDashJsMod extends js.Object {
  @js.native
  class EmojiConvertor () extends js.Object {
    var allow_caps: Boolean = js.native
    var allow_native: Boolean = js.native
    var avoid_ms_emoji: Boolean = js.native
    var colons_mode: Boolean = js.native
    var img_set: String = js.native
    var img_sets: StringDictionary[Anon_Mask] = js.native
    var img_suffix: String = js.native
    var include_text: Boolean = js.native
    var include_title: Boolean = js.native
    var replace_mode: String = js.native
    var text_mode: Boolean = js.native
    var use_css_imgs: Boolean = js.native
    var use_sheet: Boolean = js.native
    def addAliases(aliases: StringDictionary[String]): Unit = js.native
    def removeAliases(aliases: js.Array[String]): Unit = js.native
    def replace_colons(str: String): String = js.native
    def replace_emoticons(str: String): String = js.native
    def replace_emoticons_with_colons(str: String): String = js.native
    def replace_unified(str: String): String = js.native
  }
  
}

