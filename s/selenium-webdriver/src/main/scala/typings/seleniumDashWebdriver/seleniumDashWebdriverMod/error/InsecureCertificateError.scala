package typings.seleniumDashWebdriver.seleniumDashWebdriverMod.error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indicates a navigation event caused the browser to generate a certificate
  * warning. This is usually caused by an expired or invalid TLS certificate.
  */
@JSImport("selenium-webdriver", "error.InsecureCertificateError")
@js.native
class InsecureCertificateError () extends WebDriverError {
  def this(message: String) = this()
}

