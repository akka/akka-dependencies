# Lightbend support terminology

Lightbend uses the following terminology to designate the level of support provided for products or specific components of products that are included in Lightbend's services.

## Supported

Applies to any product for which Lightbend will provide fixes and patches to subscribers on request.  Examples of *Supported* products include: Akka, Akka HTTP, Akka Streams, and Alpakka Kafka Connector.

## Certified

Other products that work with Lightbend products and are production ready, but are not supported by Lightbend.  We will not provide fixes or patches.  Lightbend Support will assist subscribers using a *Certified* product via Developer Assist.  We do our best to document the recommended and known-to-work configurations, approaches, and architectures when using Lightbend *Supported* products with *Certified* products.

In specific cases we may choose to refer to these products as *Certified Integrations* -- products we integrate with -- or *Certified Platforms* -- foundational products that we require to run (such as a Java VM). Certification applies to a specific usage and not all usages.  For example, Apache Cassandra will be Certified to work with Akka Persistence Cassandra.  Lightbend assistance for Cassandra is limited to customers' use of Cassandra with the specific Lightbend product usage only, not for any other use case.

## Incubating

A component or integration that is not fully tested and may have limited functionality.  These components are not recommended for production use. Although the component may be *Supported* or *Certified* in future releases, Lightbend cannot guarantee when or if that will happen.

## End of Life (EOL)

Lightbend commits to providing 1 year advance notice before ending support for any *Supported* component, so an EOL announcement will include the date on which a product is EOL.  A product remains *Supported* until the EOL date.  Once the EOL date passes, Lightbend will no longer support the product.

## Community Driven

Applies to projects or components which are part of Lightbend's repositories, but are not actively *Supported* or *Certified* by Lightbend.  These are often projects that are specific to a subset of the community and are driven by community members.  This may include projects that were idea spikes that were not interesting enough to pursue, or projects that used to be driven by Lightbend, but are no longer. Examples include many Alpakka connectors, or example code projects.
