package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionLanguageMapping extends js.Object {
  /**
    * The closed caption channel being described by this CaptionLanguageMapping.  Each channel mapping must have a unique channel number (maximum of 4)
    */
  var CaptionChannel: __integerMin1Max4 = js.native
  /**
    * Three character ISO 639-2 language code (see http://www.loc.gov/standards/iso639-2)
    */
  var LanguageCode: __stringMin3Max3 = js.native
  /**
    * Textual description of language
    */
  var LanguageDescription: __stringMin1 = js.native
}

object CaptionLanguageMapping {
  @scala.inline
  def apply(
    CaptionChannel: __integerMin1Max4,
    LanguageCode: __stringMin3Max3,
    LanguageDescription: __stringMin1
  ): CaptionLanguageMapping = {
    val __obj = js.Dynamic.literal(CaptionChannel = CaptionChannel.asInstanceOf[js.Any], LanguageCode = LanguageCode.asInstanceOf[js.Any], LanguageDescription = LanguageDescription.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CaptionLanguageMapping]
  }
}

