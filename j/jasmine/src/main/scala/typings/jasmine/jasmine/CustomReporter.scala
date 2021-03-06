package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomReporter extends js.Object {
  var jasmineDone: js.UndefOr[js.Function1[/* runDetails */ RunDetails, Unit]] = js.undefined
  var jasmineStarted: js.UndefOr[js.Function1[/* suiteInfo */ SuiteInfo, Unit]] = js.undefined
  var specDone: js.UndefOr[js.Function1[/* result */ CustomReporterResult, Unit]] = js.undefined
  var specStarted: js.UndefOr[js.Function1[/* result */ CustomReporterResult, Unit]] = js.undefined
  var suiteDone: js.UndefOr[js.Function1[/* result */ CustomReporterResult, Unit]] = js.undefined
  var suiteStarted: js.UndefOr[js.Function1[/* result */ CustomReporterResult, Unit]] = js.undefined
}

object CustomReporter {
  @scala.inline
  def apply(
    jasmineDone: /* runDetails */ RunDetails => Unit = null,
    jasmineStarted: /* suiteInfo */ SuiteInfo => Unit = null,
    specDone: /* result */ CustomReporterResult => Unit = null,
    specStarted: /* result */ CustomReporterResult => Unit = null,
    suiteDone: /* result */ CustomReporterResult => Unit = null,
    suiteStarted: /* result */ CustomReporterResult => Unit = null
  ): CustomReporter = {
    val __obj = js.Dynamic.literal()
    if (jasmineDone != null) __obj.updateDynamic("jasmineDone")(js.Any.fromFunction1(jasmineDone))
    if (jasmineStarted != null) __obj.updateDynamic("jasmineStarted")(js.Any.fromFunction1(jasmineStarted))
    if (specDone != null) __obj.updateDynamic("specDone")(js.Any.fromFunction1(specDone))
    if (specStarted != null) __obj.updateDynamic("specStarted")(js.Any.fromFunction1(specStarted))
    if (suiteDone != null) __obj.updateDynamic("suiteDone")(js.Any.fromFunction1(suiteDone))
    if (suiteStarted != null) __obj.updateDynamic("suiteStarted")(js.Any.fromFunction1(suiteStarted))
    __obj.asInstanceOf[CustomReporter]
  }
}

