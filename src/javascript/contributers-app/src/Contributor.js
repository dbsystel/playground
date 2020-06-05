import React from 'react';
import './Contributor.css';

function Contributor(props) {
    const {
        name,
        nickname,
        twitterLink,
        websiteLink,
        info
    } = props;
    return (
        <div className="contributor">
            <ul>
                <li>Name: {name}</li>
                <li>Nickname: {nickname}</li>
                <li>Twitter: <a className="contributor-link" href={websiteLink}>{websiteLink}</a></li>
                <li>Website: <a className="contributor-link" href={twitterLink}>{twitterLink}</a></li>
                <li>
                    <div>Info:</div>
                    <div>{info}</div>
                </li>
            </ul>
        </div>
    );
}

export default Contributor;
