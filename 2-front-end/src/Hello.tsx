import { useEffect } from "react";

type Props = {
    message: string;
}

function Hello({ message }: Props) {

    useEffect(() => {
        // aqui ira ficar chamada para API para buscar os produtos
        console.log('componente iniciou!');
    }, []);

    return (
        <h1>Componente {message}</h1>
    )
}

export default Hello;