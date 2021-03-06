package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesGlobalTableNotFoundExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeGlobalTableExceptionsUnionMod.DescribeGlobalTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeGlobalTableSettingsExceptionsUnionMod.DescribeGlobalTableSettingsExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUpdateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUpdateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalTableNotFoundException
  extends ServiceException[_GlobalTableNotFoundExceptionDetails]
     with DescribeGlobalTableExceptionsUnion
     with DescribeGlobalTableSettingsExceptionsUnion
     with UpdateGlobalTableExceptionsUnion
     with UpdateGlobalTableSettingsExceptionsUnion {
  @JSName("name")
  var name_GlobalTableNotFoundException: typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.GlobalTableNotFoundException = js.native
}

