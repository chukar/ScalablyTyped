package typings.atPulumiAws.atPulumiAwsMod.lambda

import typings.atPulumiAws.lambdaFunctionEventInvokeConfigMod.FunctionEventInvokeConfigArgs
import typings.atPulumiAws.lambdaFunctionEventInvokeConfigMod.FunctionEventInvokeConfigState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "lambda.FunctionEventInvokeConfig")
@js.native
class FunctionEventInvokeConfig protected ()
  extends typings.atPulumiAws.lambdaMod.FunctionEventInvokeConfig {
  /**
    * Create a FunctionEventInvokeConfig resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: FunctionEventInvokeConfigArgs) = this()
  def this(name: String, args: FunctionEventInvokeConfigArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "lambda.FunctionEventInvokeConfig")
@js.native
object FunctionEventInvokeConfig extends js.Object {
  /**
    * Get an existing FunctionEventInvokeConfig resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.lambdaFunctionEventInvokeConfigMod.FunctionEventInvokeConfig = js.native
  def get(name: String, id: Input[ID], state: FunctionEventInvokeConfigState): typings.atPulumiAws.lambdaFunctionEventInvokeConfigMod.FunctionEventInvokeConfig = js.native
  def get(name: String, id: Input[ID], state: FunctionEventInvokeConfigState, opts: CustomResourceOptions): typings.atPulumiAws.lambdaFunctionEventInvokeConfigMod.FunctionEventInvokeConfig = js.native
  /**
    * Returns true if the given object is an instance of FunctionEventInvokeConfig.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/functionEventInvokeConfig.FunctionEventInvokeConfig */ Boolean = js.native
}

