package typings.relayDashCompiler

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.languageAstMod.ASTNode
import typings.graphql.languageAstMod.DefinitionNode
import typings.graphql.typeDefinitionMod.GraphQLType
import typings.relayDashCompiler.libBinRelayCompilerMainMod.Config
import typings.relayDashCompiler.libCoreGraphQLCompilerContextMod.CompilerContextDocument
import typings.relayDashCompiler.libCoreGraphQLCompilerContextMod.IRTransform
import typings.relayDashCompiler.libCoreGraphQLIRMod.Fragment
import typings.relayDashCompiler.libCoreGraphQLIRMod.Location
import typings.relayDashCompiler.libCoreGraphQLIRMod.Root
import typings.relayDashCompiler.libCoreGraphQLIRVisitorMod.NodeVisitor
import typings.relayDashCompiler.libCoreGraphQLIRVisitorMod.VisitNode
import typings.relayDashCompiler.libCoreRelayCompilerErrorMod.UserError
import typings.relayDashCompiler.libReportersGraphQLConsoleReporterMod.GraphQLMultiReporter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler", JSImport.Namespace)
@js.native
object relayDashCompilerMod extends js.Object {
  @js.native
  class ConsoleReporter () extends GraphQLMultiReporter {
    /* CompleteClass */
    override def reportError(caughtLocation: String, error: Error): Unit = js.native
    /* CompleteClass */
    override def reportMessage(message: String): Unit = js.native
    /* CompleteClass */
    override def reportTime(name: String, ms: Double): Unit = js.native
  }
  
  @js.native
  class GraphQLCompilerContext protected ()
    extends typings.relayDashCompiler.libCoreGraphQLCompilerContextMod.GraphQLCompilerContext {
    def this(serverSchema: GraphQLSchema) = this()
    def this(serverSchema: GraphQLSchema, clientSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class MultiReporter ()
    extends typings.relayDashCompiler.libReportersGraphQLMultiReporterMod.GraphQLMultiReporter {
    /* CompleteClass */
    override def reportError(caughtLocation: String, error: Error): Unit = js.native
    /* CompleteClass */
    override def reportMessage(message: String): Unit = js.native
    /* CompleteClass */
    override def reportTime(name: String, ms: Double): Unit = js.native
  }
  
  var transformASTSchema: js.Function2[/* schema */ GraphQLSchema, /* transforms */ js.Array[String], GraphQLSchema] = js.native
  def createUserError(message: String): UserError = js.native
  def createUserError(message: String, locations: js.Array[Location]): UserError = js.native
  def createUserError(message: String, locations: js.Array[Location], nodes: js.Array[ASTNode]): UserError = js.native
  def relayCompiler(config: Config): js.Promise[Unit] = js.native
  @js.native
  object ASTConvert extends js.Object {
    def transformASTSchema(schema: GraphQLSchema, transforms: js.Array[String]): GraphQLSchema = js.native
  }
  
  @js.native
  object IRTransforms extends js.Object {
    val codegenTransforms: js.Array[IRTransform] = js.native
    val commonTransforms: js.Array[IRTransform] = js.native
    val fragmentTransforms: js.Array[IRTransform] = js.native
    val printTransforms: js.Array[IRTransform] = js.native
    val queryTransforms: js.Array[IRTransform] = js.native
    val schemaExtensions: js.Array[String] = js.native
  }
  
  @js.native
  object IRVisitor extends js.Object {
    def visit(root: VisitNode, visitor: NodeVisitor): js.Any = js.native
  }
  
  @js.native
  object Parser extends js.Object {
    def parse(schema: GraphQLSchema, text: String): js.Array[Root | Fragment] = js.native
    def parse(schema: GraphQLSchema, text: String, filename: String): js.Array[Root | Fragment] = js.native
    def transform(schema: GraphQLSchema, documents: js.Array[DefinitionNode]): js.Array[Root | Fragment] = js.native
  }
  
  @js.native
  object Printer extends js.Object {
    def print(node: CompilerContextDocument): String = js.native
  }
  
  @js.native
  object SchemaUtils extends js.Object {
    def isAbstractType(`type`: GraphQLType): Boolean = js.native
  }
  
}

