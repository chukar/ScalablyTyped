package typings.protractor.protractorMod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indicates a {@linkplain ./webdriver.WebElement#click click command} could
  * not completed because the click target is obscured by other elements on the
  * page.
  */
@JSImport("protractor", "error.ElementClickInterceptedError")
@js.native
class ElementClickInterceptedError ()
  extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.error.ElementClickInterceptedError {
  def this(message: String) = this()
}

