package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlreadyUpToDate extends js.Object {
  var alreadyUpToDate: Double
  var inlineUpdateReceived: Double
  var installed: Double
  var preinstalled: Double
  var receivedInstallOrUpdate: Double
  var receivedUninstall: Double
  var requestedUpdate: Double
  var uninstalled: Double
  var updated: Double
}

object Anon_AlreadyUpToDate {
  @scala.inline
  def apply(
    alreadyUpToDate: Double,
    inlineUpdateReceived: Double,
    installed: Double,
    preinstalled: Double,
    receivedInstallOrUpdate: Double,
    receivedUninstall: Double,
    requestedUpdate: Double,
    uninstalled: Double,
    updated: Double
  ): Anon_AlreadyUpToDate = {
    val __obj = js.Dynamic.literal(alreadyUpToDate = alreadyUpToDate.asInstanceOf[js.Any], inlineUpdateReceived = inlineUpdateReceived.asInstanceOf[js.Any], installed = installed.asInstanceOf[js.Any], preinstalled = preinstalled.asInstanceOf[js.Any], receivedInstallOrUpdate = receivedInstallOrUpdate.asInstanceOf[js.Any], receivedUninstall = receivedUninstall.asInstanceOf[js.Any], requestedUpdate = requestedUpdate.asInstanceOf[js.Any], uninstalled = uninstalled.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AlreadyUpToDate]
  }
}

