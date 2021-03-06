package typings.mfiles

import typings.mfiles.MFiles.MFOCRLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCROptions extends js.Object {
  var PrimaryLanguage: MFOCRLanguage
  var SecondaryLanguage: MFOCRLanguage
  def Clone(): IOCROptions
}

object IOCROptions {
  @scala.inline
  def apply(Clone: () => IOCROptions, PrimaryLanguage: MFOCRLanguage, SecondaryLanguage: MFOCRLanguage): IOCROptions = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PrimaryLanguage = PrimaryLanguage.asInstanceOf[js.Any], SecondaryLanguage = SecondaryLanguage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOCROptions]
  }
}

