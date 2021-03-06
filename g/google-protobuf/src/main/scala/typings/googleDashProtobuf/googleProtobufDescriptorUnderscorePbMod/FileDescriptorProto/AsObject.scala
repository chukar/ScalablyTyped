package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileDescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var dependencyList: js.Array[String]
  var enumTypeList: js.Array[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProto.AsObject
  ]
  var extensionList: js.Array[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProto.AsObject
  ]
  var messageTypeList: js.Array[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.DescriptorProto.AsObject
  ]
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileOptions.AsObject
  ] = js.undefined
  var pb_package: js.UndefOr[String] = js.undefined
  var publicDependencyList: js.Array[Double]
  var serviceList: js.Array[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.ServiceDescriptorProto.AsObject
  ]
  var sourceCodeInfo: js.UndefOr[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfo.AsObject
  ] = js.undefined
  var syntax: js.UndefOr[String] = js.undefined
  var weakDependencyList: js.Array[Double]
}

object AsObject {
  @scala.inline
  def apply(
    dependencyList: js.Array[String],
    enumTypeList: js.Array[
      typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.EnumDescriptorProto.AsObject
    ],
    extensionList: js.Array[
      typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProto.AsObject
    ],
    messageTypeList: js.Array[
      typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.DescriptorProto.AsObject
    ],
    publicDependencyList: js.Array[Double],
    serviceList: js.Array[
      typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.ServiceDescriptorProto.AsObject
    ],
    weakDependencyList: js.Array[Double],
    name: String = null,
    options: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileOptions.AsObject = null,
    pb_package: String = null,
    sourceCodeInfo: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.SourceCodeInfo.AsObject = null,
    syntax: String = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(dependencyList = dependencyList.asInstanceOf[js.Any], enumTypeList = enumTypeList.asInstanceOf[js.Any], extensionList = extensionList.asInstanceOf[js.Any], messageTypeList = messageTypeList.asInstanceOf[js.Any], publicDependencyList = publicDependencyList.asInstanceOf[js.Any], serviceList = serviceList.asInstanceOf[js.Any], weakDependencyList = weakDependencyList.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (pb_package != null) __obj.updateDynamic("pb_package")(pb_package.asInstanceOf[js.Any])
    if (sourceCodeInfo != null) __obj.updateDynamic("sourceCodeInfo")(sourceCodeInfo.asInstanceOf[js.Any])
    if (syntax != null) __obj.updateDynamic("syntax")(syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

