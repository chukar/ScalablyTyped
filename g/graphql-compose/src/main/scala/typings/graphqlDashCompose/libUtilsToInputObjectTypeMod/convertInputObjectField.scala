package typings.graphqlDashCompose.libUtilsToInputObjectTypeMod

import typings.graphql.typeDefinitionMod.GraphQLInputType
import typings.graphql.typeDefinitionMod.GraphQLType
import typings.graphqlDashCompose.libSchemaComposerMod.SchemaComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/utils/toInputObjectType", "convertInputObjectField")
@js.native
object convertInputObjectField extends js.Object {
  def apply(field: GraphQLType, opts: ConvertInputObjectFieldOpts, schemaComposer: SchemaComposer[_]): GraphQLInputType | Null = js.native
}

