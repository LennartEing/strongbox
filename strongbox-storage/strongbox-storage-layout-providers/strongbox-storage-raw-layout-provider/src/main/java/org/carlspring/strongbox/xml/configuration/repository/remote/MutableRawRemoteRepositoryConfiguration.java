package org.carlspring.strongbox.xml.configuration.repository.remote;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.carlspring.strongbox.xml.repository.remote.CustomRemoteRepositoryConfiguration;
import org.carlspring.strongbox.xml.repository.remote.MutableRemoteRepositoryConfiguration;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "raw-remote-repository-configuration")
public class MutableRawRemoteRepositoryConfiguration extends MutableRemoteRepositoryConfiguration
{

    @Override
    public CustomRemoteRepositoryConfiguration getImmutable()
    {
        return new RawRemoteRepositoryConfiguration();
    }

}
