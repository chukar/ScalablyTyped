package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AbortedBySystem extends js.Object {
  var abortedBySystem: Double
  var analyzed: Double
  var canceledByUser: Double
  var cancellationInProgress: Double
  var creatingEnvironment: Double
  var none: Double
  var pendingAnalysis: Double
  var runningTests: Double
  var timedOut: Double
}

object Anon_AbortedBySystem {
  @scala.inline
  def apply(
    abortedBySystem: Double,
    analyzed: Double,
    canceledByUser: Double,
    cancellationInProgress: Double,
    creatingEnvironment: Double,
    none: Double,
    pendingAnalysis: Double,
    runningTests: Double,
    timedOut: Double
  ): Anon_AbortedBySystem = {
    val __obj = js.Dynamic.literal(abortedBySystem = abortedBySystem.asInstanceOf[js.Any], analyzed = analyzed.asInstanceOf[js.Any], canceledByUser = canceledByUser.asInstanceOf[js.Any], cancellationInProgress = cancellationInProgress.asInstanceOf[js.Any], creatingEnvironment = creatingEnvironment.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], pendingAnalysis = pendingAnalysis.asInstanceOf[js.Any], runningTests = runningTests.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AbortedBySystem]
  }
}

