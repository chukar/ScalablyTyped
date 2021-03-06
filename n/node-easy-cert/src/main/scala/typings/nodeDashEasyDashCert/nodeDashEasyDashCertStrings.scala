package typings.nodeDashEasyDashCert

import typings.nodeDashEasyDashCert.nodeDashEasyDashCertMod.CertErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nodeDashEasyDashCertStrings {
  @js.native
  sealed trait ROOT_CA_COMMON_NAME_UNSPECIFIED extends CertErrors
  
  @js.native
  sealed trait ROOT_CA_EXISTED extends CertErrors
  
  @js.native
  sealed trait ROOT_CA_NOT_EXISTS extends CertErrors
  
  @scala.inline
  def ROOT_CA_COMMON_NAME_UNSPECIFIED: ROOT_CA_COMMON_NAME_UNSPECIFIED = "ROOT_CA_COMMON_NAME_UNSPECIFIED".asInstanceOf[ROOT_CA_COMMON_NAME_UNSPECIFIED]
  @scala.inline
  def ROOT_CA_EXISTED: ROOT_CA_EXISTED = "ROOT_CA_EXISTED".asInstanceOf[ROOT_CA_EXISTED]
  @scala.inline
  def ROOT_CA_NOT_EXISTS: ROOT_CA_NOT_EXISTS = "ROOT_CA_NOT_EXISTS".asInstanceOf[ROOT_CA_NOT_EXISTS]
}

