package typings.atAwsDashSdkClientDashDynamodbDashNode.typesProvisionedThroughputExceededExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesBatchGetItemExceptionsUnionMod.BatchGetItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesBatchWriteItemExceptionsUnionMod.BatchWriteItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDeleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesGetItemExceptionsUnionMod.GetItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesPutItemExceptionsUnionMod.PutItemExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesQueryExceptionsUnionMod.QueryExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesScanExceptionsUnionMod.ScanExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedThroughputExceededException
  extends ServiceException[_ProvisionedThroughputExceededExceptionDetails]
     with BatchGetItemExceptionsUnion
     with BatchWriteItemExceptionsUnion
     with DeleteItemExceptionsUnion
     with GetItemExceptionsUnion
     with PutItemExceptionsUnion
     with QueryExceptionsUnion
     with ScanExceptionsUnion
     with UpdateItemExceptionsUnion {
  @JSName("name")
  var name_ProvisionedThroughputExceededException: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.ProvisionedThroughputExceededException = js.native
}

