package typings.astDashTypes.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.astDashTypes.genNodesMod.File
  - typings.astDashTypes.genNodesMod.Program
  - typings.astDashTypes.genNodesMod.Identifier
  - typings.astDashTypes.genNodesMod.BlockStatement
  - typings.astDashTypes.genNodesMod.EmptyStatement
  - typings.astDashTypes.genNodesMod.ExpressionStatement
  - typings.astDashTypes.genNodesMod.IfStatement
  - typings.astDashTypes.genNodesMod.LabeledStatement
  - typings.astDashTypes.genNodesMod.BreakStatement
  - typings.astDashTypes.genNodesMod.ContinueStatement
  - typings.astDashTypes.genNodesMod.WithStatement
  - typings.astDashTypes.genNodesMod.SwitchStatement
  - typings.astDashTypes.genNodesMod.SwitchCase
  - typings.astDashTypes.genNodesMod.ReturnStatement
  - typings.astDashTypes.genNodesMod.ThrowStatement
  - typings.astDashTypes.genNodesMod.TryStatement
  - typings.astDashTypes.genNodesMod.CatchClause
  - typings.astDashTypes.genNodesMod.WhileStatement
  - typings.astDashTypes.genNodesMod.DoWhileStatement
  - typings.astDashTypes.genNodesMod.ForStatement
  - typings.astDashTypes.genNodesMod.VariableDeclaration
  - typings.astDashTypes.genNodesMod.ForInStatement
  - typings.astDashTypes.genNodesMod.DebuggerStatement
  - typings.astDashTypes.genNodesMod.FunctionDeclaration
  - typings.astDashTypes.genNodesMod.FunctionExpression
  - typings.astDashTypes.genNodesMod.VariableDeclarator
  - typings.astDashTypes.genNodesMod.ThisExpression
  - typings.astDashTypes.genNodesMod.ArrayExpression
  - typings.astDashTypes.genNodesMod.ObjectExpression
  - typings.astDashTypes.genNodesMod.Property
  - typings.astDashTypes.genNodesMod.Literal
  - typings.astDashTypes.genNodesMod.SequenceExpression
  - typings.astDashTypes.genNodesMod.UnaryExpression
  - typings.astDashTypes.genNodesMod.BinaryExpression
  - typings.astDashTypes.genNodesMod.AssignmentExpression
  - typings.astDashTypes.genNodesMod.MemberExpression
  - typings.astDashTypes.genNodesMod.UpdateExpression
  - typings.astDashTypes.genNodesMod.LogicalExpression
  - typings.astDashTypes.genNodesMod.ConditionalExpression
  - typings.astDashTypes.genNodesMod.NewExpression
  - typings.astDashTypes.genNodesMod.CallExpression
  - typings.astDashTypes.genNodesMod.RestElement
  - typings.astDashTypes.genNodesMod.TypeAnnotation
  - typings.astDashTypes.genNodesMod.TSTypeAnnotation
  - typings.astDashTypes.genNodesMod.SpreadElementPattern
  - typings.astDashTypes.genNodesMod.ArrowFunctionExpression
  - typings.astDashTypes.genNodesMod.ForOfStatement
  - typings.astDashTypes.genNodesMod.YieldExpression
  - typings.astDashTypes.genNodesMod.GeneratorExpression
  - typings.astDashTypes.genNodesMod.ComprehensionBlock
  - typings.astDashTypes.genNodesMod.ComprehensionExpression
  - typings.astDashTypes.genNodesMod.ObjectProperty
  - typings.astDashTypes.genNodesMod.PropertyPattern
  - typings.astDashTypes.genNodesMod.ObjectPattern
  - typings.astDashTypes.genNodesMod.ArrayPattern
  - typings.astDashTypes.genNodesMod.MethodDefinition
  - typings.astDashTypes.genNodesMod.SpreadElement
  - typings.astDashTypes.genNodesMod.AssignmentPattern
  - typings.astDashTypes.genNodesMod.ClassPropertyDefinition
  - typings.astDashTypes.genNodesMod.ClassProperty
  - typings.astDashTypes.genNodesMod.ClassBody
  - typings.astDashTypes.genNodesMod.ClassDeclaration
  - typings.astDashTypes.genNodesMod.ClassExpression
  - typings.astDashTypes.genNodesMod.ImportSpecifier
  - typings.astDashTypes.genNodesMod.ImportNamespaceSpecifier
  - typings.astDashTypes.genNodesMod.ImportDefaultSpecifier
  - typings.astDashTypes.genNodesMod.ImportDeclaration
  - typings.astDashTypes.genNodesMod.TaggedTemplateExpression
  - typings.astDashTypes.genNodesMod.TemplateLiteral
  - typings.astDashTypes.genNodesMod.TemplateElement
  - typings.astDashTypes.genNodesMod.SpreadProperty
  - typings.astDashTypes.genNodesMod.SpreadPropertyPattern
  - typings.astDashTypes.genNodesMod.AwaitExpression
  - typings.astDashTypes.genNodesMod.JSXAttribute
  - typings.astDashTypes.genNodesMod.JSXIdentifier
  - typings.astDashTypes.genNodesMod.JSXNamespacedName
  - typings.astDashTypes.genNodesMod.JSXExpressionContainer
  - typings.astDashTypes.genNodesMod.JSXMemberExpression
  - typings.astDashTypes.genNodesMod.JSXSpreadAttribute
  - typings.astDashTypes.genNodesMod.JSXElement
  - typings.astDashTypes.genNodesMod.JSXOpeningElement
  - typings.astDashTypes.genNodesMod.JSXClosingElement
  - typings.astDashTypes.genNodesMod.JSXFragment
  - typings.astDashTypes.genNodesMod.JSXText
  - typings.astDashTypes.genNodesMod.JSXOpeningFragment
  - typings.astDashTypes.genNodesMod.JSXClosingFragment
  - typings.astDashTypes.genNodesMod.JSXEmptyExpression
  - typings.astDashTypes.genNodesMod.JSXSpreadChild
  - typings.astDashTypes.genNodesMod.TypeParameterDeclaration
  - typings.astDashTypes.genNodesMod.TSTypeParameterDeclaration
  - typings.astDashTypes.genNodesMod.TypeParameterInstantiation
  - typings.astDashTypes.genNodesMod.TSTypeParameterInstantiation
  - typings.astDashTypes.genNodesMod.ClassImplements
  - typings.astDashTypes.genNodesMod.TSExpressionWithTypeArguments
  - typings.astDashTypes.genNodesMod.AnyTypeAnnotation
  - typings.astDashTypes.genNodesMod.EmptyTypeAnnotation
  - typings.astDashTypes.genNodesMod.MixedTypeAnnotation
  - typings.astDashTypes.genNodesMod.VoidTypeAnnotation
  - typings.astDashTypes.genNodesMod.NumberTypeAnnotation
  - typings.astDashTypes.genNodesMod.NumberLiteralTypeAnnotation
  - typings.astDashTypes.genNodesMod.NumericLiteralTypeAnnotation
  - typings.astDashTypes.genNodesMod.StringTypeAnnotation
  - typings.astDashTypes.genNodesMod.StringLiteralTypeAnnotation
  - typings.astDashTypes.genNodesMod.BooleanTypeAnnotation
  - typings.astDashTypes.genNodesMod.BooleanLiteralTypeAnnotation
  - typings.astDashTypes.genNodesMod.NullableTypeAnnotation
  - typings.astDashTypes.genNodesMod.NullLiteralTypeAnnotation
  - typings.astDashTypes.genNodesMod.NullTypeAnnotation
  - typings.astDashTypes.genNodesMod.ThisTypeAnnotation
  - typings.astDashTypes.genNodesMod.ExistsTypeAnnotation
  - typings.astDashTypes.genNodesMod.ExistentialTypeParam
  - typings.astDashTypes.genNodesMod.FunctionTypeAnnotation
  - typings.astDashTypes.genNodesMod.FunctionTypeParam
  - typings.astDashTypes.genNodesMod.ArrayTypeAnnotation
  - typings.astDashTypes.genNodesMod.ObjectTypeAnnotation
  - typings.astDashTypes.genNodesMod.ObjectTypeProperty
  - typings.astDashTypes.genNodesMod.ObjectTypeSpreadProperty
  - typings.astDashTypes.genNodesMod.ObjectTypeIndexer
  - typings.astDashTypes.genNodesMod.ObjectTypeCallProperty
  - typings.astDashTypes.genNodesMod.ObjectTypeInternalSlot
  - typings.astDashTypes.genNodesMod.Variance
  - typings.astDashTypes.genNodesMod.QualifiedTypeIdentifier
  - typings.astDashTypes.genNodesMod.GenericTypeAnnotation
  - typings.astDashTypes.genNodesMod.MemberTypeAnnotation
  - typings.astDashTypes.genNodesMod.UnionTypeAnnotation
  - typings.astDashTypes.genNodesMod.IntersectionTypeAnnotation
  - typings.astDashTypes.genNodesMod.TypeofTypeAnnotation
  - typings.astDashTypes.genNodesMod.TypeParameter
  - typings.astDashTypes.genNodesMod.InterfaceTypeAnnotation
  - typings.astDashTypes.genNodesMod.InterfaceExtends
  - typings.astDashTypes.genNodesMod.InterfaceDeclaration
  - typings.astDashTypes.genNodesMod.DeclareInterface
  - typings.astDashTypes.genNodesMod.TypeAlias
  - typings.astDashTypes.genNodesMod.OpaqueType
  - typings.astDashTypes.genNodesMod.DeclareTypeAlias
  - typings.astDashTypes.genNodesMod.DeclareOpaqueType
  - typings.astDashTypes.genNodesMod.TypeCastExpression
  - typings.astDashTypes.genNodesMod.TupleTypeAnnotation
  - typings.astDashTypes.genNodesMod.DeclareVariable
  - typings.astDashTypes.genNodesMod.DeclareFunction
  - typings.astDashTypes.genNodesMod.DeclareClass
  - typings.astDashTypes.genNodesMod.DeclareModule
  - typings.astDashTypes.genNodesMod.DeclareModuleExports
  - typings.astDashTypes.genNodesMod.DeclareExportDeclaration
  - typings.astDashTypes.genNodesMod.ExportSpecifier
  - typings.astDashTypes.genNodesMod.ExportBatchSpecifier
  - typings.astDashTypes.genNodesMod.DeclareExportAllDeclaration
  - typings.astDashTypes.genNodesMod.InferredPredicate
  - typings.astDashTypes.genNodesMod.DeclaredPredicate
  - typings.astDashTypes.genNodesMod.ExportDeclaration
  - typings.astDashTypes.genNodesMod.Block
  - typings.astDashTypes.genNodesMod.Line
  - typings.astDashTypes.genNodesMod.Noop
  - typings.astDashTypes.genNodesMod.DoExpression
  - typings.astDashTypes.genNodesMod.Super
  - typings.astDashTypes.genNodesMod.BindExpression
  - typings.astDashTypes.genNodesMod.Decorator
  - typings.astDashTypes.genNodesMod.MetaProperty
  - typings.astDashTypes.genNodesMod.ParenthesizedExpression
  - typings.astDashTypes.genNodesMod.ExportDefaultDeclaration
  - typings.astDashTypes.genNodesMod.ExportNamedDeclaration
  - typings.astDashTypes.genNodesMod.ExportNamespaceSpecifier
  - typings.astDashTypes.genNodesMod.ExportDefaultSpecifier
  - typings.astDashTypes.genNodesMod.ExportAllDeclaration
  - typings.astDashTypes.genNodesMod.CommentBlock
  - typings.astDashTypes.genNodesMod.CommentLine
  - typings.astDashTypes.genNodesMod.Directive
  - typings.astDashTypes.genNodesMod.DirectiveLiteral
  - typings.astDashTypes.genNodesMod.InterpreterDirective
  - typings.astDashTypes.genNodesMod.StringLiteral
  - typings.astDashTypes.genNodesMod.NumericLiteral
  - typings.astDashTypes.genNodesMod.BigIntLiteral
  - typings.astDashTypes.genNodesMod.NullLiteral
  - typings.astDashTypes.genNodesMod.BooleanLiteral
  - typings.astDashTypes.genNodesMod.RegExpLiteral
  - typings.astDashTypes.genNodesMod.ObjectMethod
  - typings.astDashTypes.genNodesMod.ClassPrivateProperty
  - typings.astDashTypes.genNodesMod.ClassMethod
  - typings.astDashTypes.genNodesMod.ClassPrivateMethod
  - typings.astDashTypes.genNodesMod.PrivateName
  - typings.astDashTypes.genNodesMod.RestProperty
  - typings.astDashTypes.genNodesMod.ForAwaitStatement
  - typings.astDashTypes.genNodesMod.Import
  - typings.astDashTypes.genNodesMod.TSQualifiedName
  - typings.astDashTypes.genNodesMod.TSTypeReference
  - typings.astDashTypes.genNodesMod.TSAsExpression
  - typings.astDashTypes.genNodesMod.TSNonNullExpression
  - typings.astDashTypes.genNodesMod.TSAnyKeyword
  - typings.astDashTypes.genNodesMod.TSBigIntKeyword
  - typings.astDashTypes.genNodesMod.TSBooleanKeyword
  - typings.astDashTypes.genNodesMod.TSNeverKeyword
  - typings.astDashTypes.genNodesMod.TSNullKeyword
  - typings.astDashTypes.genNodesMod.TSNumberKeyword
  - typings.astDashTypes.genNodesMod.TSObjectKeyword
  - typings.astDashTypes.genNodesMod.TSStringKeyword
  - typings.astDashTypes.genNodesMod.TSSymbolKeyword
  - typings.astDashTypes.genNodesMod.TSUndefinedKeyword
  - typings.astDashTypes.genNodesMod.TSUnknownKeyword
  - typings.astDashTypes.genNodesMod.TSVoidKeyword
  - typings.astDashTypes.genNodesMod.TSThisType
  - typings.astDashTypes.genNodesMod.TSArrayType
  - typings.astDashTypes.genNodesMod.TSLiteralType
  - typings.astDashTypes.genNodesMod.TSUnionType
  - typings.astDashTypes.genNodesMod.TSIntersectionType
  - typings.astDashTypes.genNodesMod.TSConditionalType
  - typings.astDashTypes.genNodesMod.TSInferType
  - typings.astDashTypes.genNodesMod.TSTypeParameter
  - typings.astDashTypes.genNodesMod.TSParenthesizedType
  - typings.astDashTypes.genNodesMod.TSFunctionType
  - typings.astDashTypes.genNodesMod.TSConstructorType
  - typings.astDashTypes.genNodesMod.TSDeclareFunction
  - typings.astDashTypes.genNodesMod.TSDeclareMethod
  - typings.astDashTypes.genNodesMod.TSMappedType
  - typings.astDashTypes.genNodesMod.TSTupleType
  - typings.astDashTypes.genNodesMod.TSRestType
  - typings.astDashTypes.genNodesMod.TSOptionalType
  - typings.astDashTypes.genNodesMod.TSIndexedAccessType
  - typings.astDashTypes.genNodesMod.TSTypeOperator
  - typings.astDashTypes.genNodesMod.TSIndexSignature
  - typings.astDashTypes.genNodesMod.TSPropertySignature
  - typings.astDashTypes.genNodesMod.TSMethodSignature
  - typings.astDashTypes.genNodesMod.TSTypePredicate
  - typings.astDashTypes.genNodesMod.TSCallSignatureDeclaration
  - typings.astDashTypes.genNodesMod.TSConstructSignatureDeclaration
  - typings.astDashTypes.genNodesMod.TSEnumMember
  - typings.astDashTypes.genNodesMod.TSTypeQuery
  - typings.astDashTypes.genNodesMod.TSImportType
  - typings.astDashTypes.genNodesMod.TSTypeLiteral
  - typings.astDashTypes.genNodesMod.TSTypeAssertion
  - typings.astDashTypes.genNodesMod.TSEnumDeclaration
  - typings.astDashTypes.genNodesMod.TSTypeAliasDeclaration
  - typings.astDashTypes.genNodesMod.TSModuleBlock
  - typings.astDashTypes.genNodesMod.TSModuleDeclaration
  - typings.astDashTypes.genNodesMod.TSImportEqualsDeclaration
  - typings.astDashTypes.genNodesMod.TSExternalModuleReference
  - typings.astDashTypes.genNodesMod.TSExportAssignment
  - typings.astDashTypes.genNodesMod.TSNamespaceExportDeclaration
  - typings.astDashTypes.genNodesMod.TSInterfaceBody
  - typings.astDashTypes.genNodesMod.TSInterfaceDeclaration
  - typings.astDashTypes.genNodesMod.TSParameterProperty
  - typings.astDashTypes.genNodesMod.OptionalMemberExpression
  - typings.astDashTypes.genNodesMod.OptionalCallExpression
*/
trait ASTNode extends js.Object

