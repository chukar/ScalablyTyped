package typings.atAwsDashSdkClientDashLambdaDashNode.typesResourceConflictExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesAddPermissionExceptionsUnionMod.AddPermissionExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesCreateAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesCreateEventSourceMappingExceptionsUnionMod.CreateEventSourceMappingExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesCreateFunctionExceptionsUnionMod.CreateFunctionExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesDeleteFunctionExceptionsUnionMod.DeleteFunctionExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUpdateEventSourceMappingExceptionsUnionMod.UpdateEventSourceMappingExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUpdateFunctionConfigurationExceptionsUnionMod.UpdateFunctionConfigurationExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceConflictException
  extends ServiceException[_ResourceConflictExceptionDetails]
     with AddPermissionExceptionsUnion
     with CreateAliasExceptionsUnion
     with CreateEventSourceMappingExceptionsUnion
     with CreateFunctionExceptionsUnion
     with DeleteFunctionExceptionsUnion
     with UpdateEventSourceMappingExceptionsUnion
     with UpdateFunctionConfigurationExceptionsUnion {
  @JSName("name")
  var name_ResourceConflictException: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.ResourceConflictException = js.native
}

