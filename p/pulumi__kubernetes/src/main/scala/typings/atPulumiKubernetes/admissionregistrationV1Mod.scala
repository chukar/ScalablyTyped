package typings.atPulumiKubernetes

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/admissionregistration/v1", JSImport.Namespace)
@js.native
object admissionregistrationV1Mod extends js.Object {
  @js.native
  class MutatingWebhookConfiguration protected ()
    extends typings.atPulumiKubernetes.admissionregistrationV1MutatingWebhookConfigurationMod.MutatingWebhookConfiguration {
    /**
      * Create a admissionregistration.v1.MutatingWebhookConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.admissionregistration.v1.MutatingWebhookConfiguration
    ) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.admissionregistration.v1.MutatingWebhookConfiguration,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class MutatingWebhookConfigurationList protected ()
    extends typings.atPulumiKubernetes.admissionregistrationV1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList {
    /**
      * Create a admissionregistration.v1.MutatingWebhookConfigurationList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.admissionregistration.v1.MutatingWebhookConfigurationList
    ) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.admissionregistration.v1.MutatingWebhookConfigurationList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class ValidatingWebhookConfiguration protected ()
    extends typings.atPulumiKubernetes.admissionregistrationV1ValidatingWebhookConfigurationMod.ValidatingWebhookConfiguration {
    /**
      * Create a admissionregistration.v1.ValidatingWebhookConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.admissionregistration.v1.ValidatingWebhookConfiguration
    ) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.admissionregistration.v1.ValidatingWebhookConfiguration,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class ValidatingWebhookConfigurationList protected ()
    extends typings.atPulumiKubernetes.admissionregistrationV1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList {
    /**
      * Create a admissionregistration.v1.ValidatingWebhookConfigurationList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.admissionregistration.v1.ValidatingWebhookConfigurationList
    ) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.admissionregistration.v1.ValidatingWebhookConfigurationList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  /* static members */
  @js.native
  object MutatingWebhookConfiguration extends js.Object {
    /**
      * Get the state of an existing `MutatingWebhookConfiguration` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.admissionregistrationV1MutatingWebhookConfigurationMod.MutatingWebhookConfiguration = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.admissionregistrationV1MutatingWebhookConfigurationMod.MutatingWebhookConfiguration = js.native
    /**
      * Returns true if the given object is an instance of MutatingWebhookConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/MutatingWebhookConfiguration.MutatingWebhookConfiguration */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MutatingWebhookConfigurationList extends js.Object {
    /**
      * Get the state of an existing `MutatingWebhookConfigurationList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.admissionregistrationV1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.admissionregistrationV1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = js.native
    /**
      * Returns true if the given object is an instance of MutatingWebhookConfigurationList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/MutatingWebhookConfigurationList.MutatingWebhookConfigurationList */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ValidatingWebhookConfiguration extends js.Object {
    /**
      * Get the state of an existing `ValidatingWebhookConfiguration` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.admissionregistrationV1ValidatingWebhookConfigurationMod.ValidatingWebhookConfiguration = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.admissionregistrationV1ValidatingWebhookConfigurationMod.ValidatingWebhookConfiguration = js.native
    /**
      * Returns true if the given object is an instance of ValidatingWebhookConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/ValidatingWebhookConfiguration.ValidatingWebhookConfiguration */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ValidatingWebhookConfigurationList extends js.Object {
    /**
      * Get the state of an existing `ValidatingWebhookConfigurationList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.admissionregistrationV1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.admissionregistrationV1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList = js.native
    /**
      * Returns true if the given object is an instance of ValidatingWebhookConfigurationList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/ValidatingWebhookConfigurationList.ValidatingWebhookConfigurationList */ Boolean = js.native
  }
  
}

