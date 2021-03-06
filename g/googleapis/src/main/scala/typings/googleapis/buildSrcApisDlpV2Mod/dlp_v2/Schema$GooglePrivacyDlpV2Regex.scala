package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message defining a custom regular expression.
  */
@js.native
trait Schema$GooglePrivacyDlpV2Regex extends js.Object {
  /**
    * The index of the submatch to extract as findings. When not specified, the
    * entire match is returned. No more than 3 may be included.
    */
  var groupIndexes: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Pattern defining the regular expression. Its syntax
    * (https://github.com/google/re2/wiki/Syntax) can be found under the
    * google/re2 repository on GitHub.
    */
  var pattern: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2Regex {
  @scala.inline
  def apply(groupIndexes: js.Array[Double] = null, pattern: String = null): Schema$GooglePrivacyDlpV2Regex = {
    val __obj = js.Dynamic.literal()
    if (groupIndexes != null) __obj.updateDynamic("groupIndexes")(groupIndexes.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2Regex]
  }
}

