package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesCopyObjectInputMod.CopyObjectInput
import typings.atAwsDashSdkClientDashS3DashNode.typesCopyObjectOutputMod.CopyObjectOutput
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/CopyObjectCommand", JSImport.Namespace)
@js.native
object commandsCopyObjectCommandMod extends js.Object {
  @js.native
  class CopyObjectCommand protected () extends Command[
          InputTypesUnion, 
          CopyObjectInput, 
          OutputTypesUnion, 
          CopyObjectOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: CopyObjectInput) = this()
    /* CompleteClass */
    override val input: CopyObjectInput = js.native
    val middlewareStack: MiddlewareStack[CopyObjectInput, CopyObjectOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[CopyObjectInput, CopyObjectOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[CopyObjectInput, CopyObjectOutput] = js.native
  }
  
}

