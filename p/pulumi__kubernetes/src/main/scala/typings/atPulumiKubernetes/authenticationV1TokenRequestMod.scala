package typings.atPulumiKubernetes

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.authenticationDotk8sDotioSlashv1
import typings.atPulumiKubernetes.typesOutputMod.authentication.v1.TokenRequestSpec
import typings.atPulumiKubernetes.typesOutputMod.authentication.v1.TokenRequestStatus
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/authentication/v1/TokenRequest", JSImport.Namespace)
@js.native
object authenticationV1TokenRequestMod extends js.Object {
  @js.native
  class TokenRequest protected () extends CustomResource {
    /**
      * Create a authentication.v1.TokenRequest resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.authentication.v1.TokenRequest) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.authentication.v1.TokenRequest,
      opts: CustomResourceOptions
    ) = this()
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output[authenticationDotk8sDotioSlashv1] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output[typings.atPulumiKubernetes.atPulumiKubernetesStrings.TokenRequest] = js.native
    val metadata: Output[ObjectMeta] = js.native
    val spec: Output[TokenRequestSpec] = js.native
    val status: Output[TokenRequestStatus] = js.native
  }
  
  /* static members */
  @js.native
  object TokenRequest extends js.Object {
    /**
      * Get the state of an existing `TokenRequest` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): TokenRequest = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): TokenRequest = js.native
    /**
      * Returns true if the given object is an instance of TokenRequest.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authentication/v1/TokenRequest.TokenRequest */ Boolean = js.native
  }
  
}

