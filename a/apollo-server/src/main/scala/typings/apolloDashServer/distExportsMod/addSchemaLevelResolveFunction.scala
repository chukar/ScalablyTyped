package typings.apolloDashServer.distExportsMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "addSchemaLevelResolveFunction")
@js.native
object addSchemaLevelResolveFunction extends js.Object {
  def apply(schema: GraphQLSchema, fn: GraphQLFieldResolver[_, _, StringDictionary[_]]): Unit = js.native
}

