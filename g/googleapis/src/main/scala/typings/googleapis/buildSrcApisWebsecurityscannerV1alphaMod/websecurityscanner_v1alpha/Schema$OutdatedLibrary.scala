package typings.googleapis.buildSrcApisWebsecurityscannerV1alphaMod.websecurityscanner_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information reported for an outdated library.
  */
@js.native
trait Schema$OutdatedLibrary extends js.Object {
  /**
    * URLs to learn more information about the vulnerabilities in the library.
    */
  var learnMoreUrls: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of the outdated library.
    */
  var libraryName: js.UndefOr[String] = js.native
  /**
    * The version number.
    */
  var version: js.UndefOr[String] = js.native
}

object Schema$OutdatedLibrary {
  @scala.inline
  def apply(learnMoreUrls: js.Array[String] = null, libraryName: String = null, version: String = null): Schema$OutdatedLibrary = {
    val __obj = js.Dynamic.literal()
    if (learnMoreUrls != null) __obj.updateDynamic("learnMoreUrls")(learnMoreUrls.asInstanceOf[js.Any])
    if (libraryName != null) __obj.updateDynamic("libraryName")(libraryName.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OutdatedLibrary]
  }
}

